/**
 * Common build module
 */

#MPLModule('Maven Build', CFG)

if( fileExists('Dockerfile') ) {
  echo "File exist"
  MPLModule('Docker Build', CFG)
}
