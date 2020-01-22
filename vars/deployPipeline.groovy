def call()
{
	node('master')
	{
<<<<<<< HEAD
		
		sshagent(['9041adc5-5b08-4d24-b296-7351557864ca']) 
		{
		   sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@35.154.170.98:/opt/apache-tomcat-9.0.30/webapps/"
		} 
	}
=======
		stage('Deploy stage')
		{
			sshagent(['Tomcat-Credentials']) 
			{
			   sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@35.154.170.98:/opt/apache-tomcat-9.0.30/webapps/"
			} 
		}
	}

>>>>>>> 8ce7e124cfd38b1ed6b7bc1cd210f0c9b943287d
}
