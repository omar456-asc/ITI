#!/bin/bash

# Check if the script is being run as root
[ "$(id -u)" -eq 0 ] || { echo "This script must be run as root."; exit 1; }

# Get the current system load
LOAD=$(uptime | awk '{print $10}')

# Get the current date and time
DATE=$(date '+%Y-%m-%d %H:%M:%S')

# Write the system load and date/time to the log file
echo "[$DATE] System load: $LOAD" >> /var/log/system-load

exit 0
