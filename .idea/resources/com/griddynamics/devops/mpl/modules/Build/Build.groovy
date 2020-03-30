/**
 * Common build module
 */

MPLModule('Mvn Build', CFG)
echo "...Test Build..."
if( fileExists('Dockerfile') ) {
  MPLModule('Docker Build', CFG)
}
