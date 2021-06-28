withCredentials([string(credentialsId: 'amazon', variable: 'VAR')]) {
  // available as an env variable, but will be masked if you try to print it out any which way
  // note: single quotes prevent Groovy interpolation; expansion is by Bourne Shell, which is what you want
  sh 'echo $VAR'
}
