def call(Map buildParam)
{
properties([parameters([choice(choices: ['SNAPSHOT', 'RELEASE'], description: 'Select type', name: 'BUILD')])])

}
stage('Demo') 
{
    echo 'Hello Vamsi'
    sayHello 'Dave'
}
