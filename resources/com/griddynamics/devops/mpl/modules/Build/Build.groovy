/**
 * Common build module
 */
MPLModule('Maven Build', CFG)

if( fileExists('Dockerfile') ) {
  MPLModule('Docker Build', CFG)
  echo "Test build groovy"
}