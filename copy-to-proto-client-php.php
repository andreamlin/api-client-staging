<?php

$copy_list = [
    ['google-cloud-bigtable-v2'],
    ['google-cloud-bigtable-admin-v2']
];

foreach ($copy_list as $copyArr) {
    $copyDir = $copyArr[0];
    $srcDir = '../api-client-staging/generated/php/' . $copyDir . '/proto/src/*';
    $dstDir = '../proto-client-php/src/';
    shell_exec('cp -r ' . $srcDir . ' ' . $dstDir);
}
