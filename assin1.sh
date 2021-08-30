#!bin/bash
environment=$1
appname=$2
if [ "$environment" = "Prod" ]; then
  if [ "$appname" = "VM" ]; then
	  echo "App ID = $environment $appname 001 "
	elif [ "$appname" = "Oracle" ]; then
  	echo "App ID = $environment $appname 001 "
  elif [ "$appname" = "Webserver" ]; then
    echo "App ID = $environment $appname 001 "
  fi
elif [ "$environment" = "Dev" ]; then
  if [ "$appname" = "VM" ]; then
	  echo "App ID = $environment $appname 002 "
	elif [ "$appname" = "Oracle" ]; then
  	echo "App ID = $environment $appname 002 "
  elif [ "$appname" = "Webserver" ]; then
    echo "App ID = $environment $appname 002 "
  fi
elif [ "$environment" = "Test" ]; then
  if [ "$appname" = "VM" ]; then
	  echo "App ID = $environment $appname 003 "
	elif [ "$appname" = "Oracle" ]; then
  	echo "App ID = $environment $appname 003 "
  elif [ "$appname" = "Webserver" ]; then
    echo "App ID = $environment $appname 003 "
  fi
else
 echo "Please select the appropriate options"
fi
