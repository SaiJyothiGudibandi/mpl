/**
 * Common build module
 */

//MPLModule('Maven Build', CFG)
echo "...Test Build..."
if( fileExists('Dockerfile') ) {
  MPLModule('Docker Build', CFG)
}
