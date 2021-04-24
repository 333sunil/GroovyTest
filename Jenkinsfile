node {
       stage('git clone'){

                def repoUrl = 'ghttps://github.com/333sunil/GroovyTest'
                git url: repoUrl, changelog: false, poll: false, cbranch: 'master'

        }
        stage('run gradle task') {
            sh "gradlew runScript"
        }
}
