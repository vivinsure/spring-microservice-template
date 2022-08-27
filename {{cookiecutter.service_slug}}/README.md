# {{ cookiecutter.service_name }}

# Template Installation
## Pre Initialization
You'll need to make a personal token that has workflow and repo permissions.

Add this token to the actions secrets

`GH_TOKEN=<your token>`

Additionally, edit the cookiecutter.json file to specify your repository
name.  

Pushing up this cookiecutter.json file change will kickoff the workflow
that starts cookiecutter.

## Kubernetes Setup
Add the kubeconfig which you'll use to write to okteto
`KUBECONFIG=<your okteto kube config>`

## Setup secrets for okteto to access canister.io
kubectl create secret --namespace {{ cookiecutter.service_namespace }} docker-registry regcred --docker-server=https://cloud.canister.io:5000 --docker-username=<canister username> --docker-password=<canister password>
