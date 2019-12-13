def call(Map buildParam)
{
properties([parameters([choice(choices: ['SNAPSHOT', 'RELEASE'], description: 'Select type', name: 'BUILD')])])
node
stage('Demo') 
{
    def mvn_version = "Maven"
    echo 'Welcome to DevOps'
    if (params.BUILD == 'SNAPSHOT')    
	{
	echo 'Prashanth'
	withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"])
	sh "mvn clean install"
	}
	else
	{
	echo 'Vamsi is great'
	}
}


}
