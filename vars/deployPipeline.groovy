def call()
{
	node('master')
	{

		
		sshagent(['9041adc5-5b08-4d24-b296-7351557864ca']) 
		{
		   sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@35.154.170.98:/opt/apache-tomcat-9.0.30/webapps/"
		} 
	}

		stage('Deploy stage')
		{
			sshagent(['Tomcat-Credentials']) 
			{
			   sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@35.154.170.98:/opt/apache-tomcat-9.0.30/webapps/"
			} 
		}
	}
}
