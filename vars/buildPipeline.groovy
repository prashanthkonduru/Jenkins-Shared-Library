def call(Map buildParam)
{
properties([parameters([choice(choices: ['SNAPSHOT', 'RELEASE'], description: 'Select type', name: 'BUILD')])])
node()
{       
	stage('checkout code')
	{
	  checkout([$class: 'GitSCM', branches: [[name: '*/development']], 
		    doGenerateSubmoduleConfigurations: false, extensions: [], 
		    submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'cred_Library', 
                    url: 'https://github.com/prashanthkonduru/maven-web-application.git']]])
	}
	stage('Demo')
	{
		def mvn_version = "maven"
		echo 'Welcome to DevOps'
		if (params.BUILD == 'SNAPSHOT')    
		{
			echo 'Prashanth'
			withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"])
			{
				sh "mvn --batch-mode clean install"
			}
		}
		else
		{
			echo 'Vamsi is great'
		}
	}
}

}
