<?php

require 'vendor/autoload.php';

use Aws\S3\S3Client;
use Aws\S3\Exception\S3Exception;
require_once("upload.php");

//var_dump($_FILES);
$uploader = new S3Uploader(AWS_ACCESS_KEY_ID, AWS_SERCRET_ACCESS_KEY, 'us-east-1', 'iti-s3-upload');
if(count($_FILES) > 0){
$uploader->uploadFile($_FILES['fileToUpload']['name'], $_FILES['fileToUpload']['size'], $_FILES['fileToUpload']['type'], $_FILES['fileToUpload']['tmp_name']);
}
else
{
    die("Please upload File");
}
?>
