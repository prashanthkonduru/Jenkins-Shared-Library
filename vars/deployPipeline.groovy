def call()
{
	node('master')
	{
		stage('Deploy stage')
		{
			sshagent(['Tomcat-Credentials']) 
			{
			   sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@35.154.170.98:/opt/apache-tomcat-9.0.30/webapps/"
			} 
		}
	}

}
