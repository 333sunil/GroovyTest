node {
       stage('git clone'){

                def repoUrl = 'https://github.com/333sunil/GroovyTest'
                git url: repoUrl, changelog: false, poll: false,credentialsId: 'gitcreds', cbranch: 'master'

        }
        stage('run gradle task') {
             gradle "runScript"
        }
}
