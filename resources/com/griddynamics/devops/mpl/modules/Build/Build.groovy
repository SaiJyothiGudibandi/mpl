/**
 * Common build module
 */

#MPLModule('Maven Build', CFG)
echo "Test build script"
if( fileExists('Dockerfile') ) {
  MPLModule('Docker Build', CFG)
}
