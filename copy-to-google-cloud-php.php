<?php

$copy_list = [
    'google-cloud-bigtable-v2',
    'google-cloud-bigtable-admin-v2'
];

foreach ($copy_list as $copyDir) {
    $srcDir = '../api-client-staging/generated/php/' . $copyDir . '/src/*';
    $dstDir = '../google-cloud-php/src/';
    shell_exec('cp -r ' . $srcDir . ' ' . $dstDir);
}
