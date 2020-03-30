/**
 * Common build module
 */

MPLModule('MavenTest Build', CFG)
echo "...Test Build..."
if( fileExists('Dockerfile') ) {
  MPLModule('Docker Build', CFG)
}
