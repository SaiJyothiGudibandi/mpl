/**
 * Common build module
 */
echo "Test build groovy"
MPLModule('Mvn Build', CFG)

if( fileExists('Dockerfile') ) {
  MPLModule('Docker Build', CFG)

}