def call(Map buildParam)
{
properties([parameters([choice(choices: ['SNAPSHOT', 'RELEASE'], description: 'Select type', name: 'BUILD')])])

stage('Demo') 
{
    echo 'Welcome to DevOps'
    if (params.BUILD == 'SNAPSHOT')    
	{
	echo 'Prashanth'
	}
	else
	{
	echo 'Vamsi is great'
	}
}


}
