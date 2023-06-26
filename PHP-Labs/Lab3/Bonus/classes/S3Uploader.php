<?php

use Aws\S3\S3Client;
use Aws\S3\Exception\S3Exception;

class S3Uploader {
    private $s3;
    private $bucketName;
    private $maxFileSize;
    private $allowedTypes;

    public function __construct($accessKeyId, $secretAccessKey, $region, $bucketName, $maxFileSize = 3145728 , $allowedTypes = array('image/jpeg', 'image/png', 'image/gif')) {
        // Instantiate an Amazon S3 client
        $this->s3 = new S3Client([
            'version' => 'latest',
            'region'  => $region,
            'credentials' => [
                'key'    => $accessKeyId,
                'secret' => $secretAccessKey,
            ],
        ]);

        $this->bucketName = $bucketName;
        $this->maxFileSize = $maxFileSize;
        $this->allowedTypes = $allowedTypes;
    }

    public function uploadFile($fileName, $fileSize, $fileType, $tmpName) {
        if ($fileSize > $this->maxFileSize) {
            die("Exceed the limit size");
        }

        if (!in_array($fileType, $this->allowedTypes)) {
            die("File type not supported");
        }

        // Upload the file to Amazon S3
        try {
            $result = $this->s3->putObject([
                'Bucket' => $this->bucketName,
                'Key'    => $fileName,
                'Body'   => fopen($tmpName, 'rb'),
                'ACL'    => 'public-read',
            ]);

            echo "File uploaded successfully!";
        } catch (S3Exception $e) {
            echo "Error uploading file: " . $e->getMessage();
        }
    }
}
