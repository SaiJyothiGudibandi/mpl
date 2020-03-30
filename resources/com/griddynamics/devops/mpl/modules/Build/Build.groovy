/**
 * Common build module
 */

MPLModule('Maven Build', CFG)

if( fileExists('DockerBuild') ) {
  MPLModule('Docker Build', CFG)
}
