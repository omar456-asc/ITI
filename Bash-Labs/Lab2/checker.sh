### Module contains all validation function

## Function accepts a file name, and return 0 if exists, 1 not exists
function checkFile {
	FILENAME=${1}
	if [ -f ${FILENAME} ]
	then
		return 0
	else
		return 1
	fi
}

## Function accepts a file name, and return 0 if has r perm, 1 not 
function checkRFile {
        FILENAME=${1}
        if [ -r ${FILENAME} ]
        then
                return 0
        else
                return 1
        fi
}

## Function accepts a file name, and return 0 if has write, 1 not exists
function checkWFile {
        FILENAME=${1}
        if [ -w ${FILENAME} ]
        then
                return 0
        else
                return 1
        fi
}


##Functionm accepts a value, return 0 if valid positive integer, 1 not
function checkInteger {
	VAL=${1}
	if [ $(echo ${VAL} | grep -c "^[0-9]*$") -eq 1 ]
	then
		return 0
	else
		return 1
	fi
}

##Functionm accepts a value, return 0 if valid negative integer, 1 not
function checkNInteger {
        VAL=${1}
        if [ $(echo ${VAL} | grep -c "^\-\{0,1\}[0-9]*$") -eq 1 ]
        then
                return 0
        else
                return 1
        fi
}

##Function accept value, return 0 if valud floating pointm 1 not
function checkFloatPoint() {
  # Check if the input is a number
  if ! [[ "$1" =~ ^[0-9]+$ ]]; then
    # Check if the input is a floating-point number
    if [[ "$1" =~ ^[0-9]+(\.[0-9]+)?$ ]]; then
      return 0
    fi
  fi
  return 1
}

##Functionm accepts a value, return 0 if valid email address, 1 not
function checkEMail() {
  # Regular expression pattern to match a valid email address
  local EMAILREG="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$"

  # Check if the input matches the email regex pattern
  if [[ "$1" =~ $EMAILREG ]]; then
    return 0
  else
    return 1
  fi
}






