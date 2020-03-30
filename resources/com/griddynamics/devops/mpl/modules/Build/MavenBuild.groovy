/**
 * Simple Maven Build
 */

// Run Maven on a Unix agent.
sh "${params.build_cmd}"

// To run Maven on a Windows agent, use
// bat "mvn -Dmaven.test.failure.ignore=true clean package"
