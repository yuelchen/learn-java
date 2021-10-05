# Read from the file file.txt and output all valid phone numbers to stdout.

while read line; do
    echo "$line" | grep -E '^[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}$|^\([0-9]{3}\)\ {1}[0-9]{3}[-]{1}[0-9]{4}$'  
done < file.txt
