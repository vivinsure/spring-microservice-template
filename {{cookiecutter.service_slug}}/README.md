# {{ cookiecutter.service_name }}

#Template Installation
##Pre Initialization
You'll need to make a personal token that has workflow permissions.

Add this token to the actions, environments secrets

`REPO_SETUP_TOKEN=<your token>`

Additionally, edit the cookiecutter.json file to specify your repository
name.  

Pushing up this cookiecutter.json file change will kickoff the workflow
that starts cookiecutter.

##Repository Setup
Create a container registry at canister.io.  Make sure that the 
registry name matches the service_slug name.

make sure to add the actions/repository secrets
`CANISTER_USERNAME=<canister username>`
`CANISTER_PASSWORD=<canister password>`

##Chart Setup
Add the token which allows you to write to your helm chart museum
`CHART_TOKEN=<your chart token>`

##Kubernetes Setup
Add the kubeconfig which you'll use to write to okteto
`KUBECONFIG=<your okteto kube config>`

##Make mvnw executeable
`git update-index --chmod=+x mvnw`

(This step should be overcome by an update to the template repo that needs to be verified)

##Setup secrets for okteto to access canister.io
kubectl create secret --namespace {{ cookiecutter.service_namespace }} docker-registry regcred --docker-server=https://cloud.canister.io:5000 --docker-username=<canister username> --docker-password=<canister password>

##Setup cloud logging
kubectl create secret --namespace {{ cookiecutter.service_namespace }} generic logzio-secrets --from-literal=LOGZIO_LOGGER_TOKEN=UaRKfHWNbOJuAIuvKjuKXWbMNuaGzNUP --from-literal=LOGZIO_METRICS_TOKEN=hiAjYwehsyFYpXRJobnhKmnUsSoxvPMz
