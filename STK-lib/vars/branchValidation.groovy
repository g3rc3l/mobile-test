def call(Map config = [:]) {
    def validated
    sh "echo ${config.branchName}"
    if ("${config.branchName}" ==~ /feature\/\w+\-\d+/ || "${config.branchName}" ==~ /feature\/\w+\-\d+\-\w+/){
        validated = true
    }
    else if ("${config.branchName}" == "develop"){
        validated = true
    }
    else if ("${config.branchName}" ==~ /release\/\d+\-\d+/){
        validated = true
    }
    else if ("${config.branchName}" == "master"){
        validated = true
    }
    else{
        validated = false
    }
    return validated
}