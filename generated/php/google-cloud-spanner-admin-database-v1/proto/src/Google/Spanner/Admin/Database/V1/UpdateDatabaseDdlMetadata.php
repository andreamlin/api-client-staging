<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/admin/database/v1/spanner_database_admin.proto

namespace Google\Spanner\Admin\Database\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Metadata type for the operation returned by
 * [UpdateDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl].
 *
 * Protobuf type <code>Google\Spanner\Admin\Database\V1\UpdateDatabaseDdlMetadata</code>
 */
class UpdateDatabaseDdlMetadata extends \Google\Protobuf\Internal\Message
{
    /**
     * The database being modified.
     *
     * Generated from protobuf field <code>string database = 1;</code>
     */
    private $database = '';
    /**
     * For an update this list contains all the statements. For an
     * individual statement, this list contains only that statement.
     *
     * Generated from protobuf field <code>repeated string statements = 2;</code>
     */
    private $statements;
    /**
     * Reports the commit timestamps of all statements that have
     * succeeded so far, where `commit_timestamps[i]` is the commit
     * timestamp for the statement `statements[i]`.
     *
     * Generated from protobuf field <code>repeated .google.protobuf.Timestamp commit_timestamps = 3;</code>
     */
    private $commit_timestamps;

    public function __construct() {
        \GPBMetadata\Google\Spanner\Admin\Database\V1\SpannerDatabaseAdmin::initOnce();
        parent::__construct();
    }

    /**
     * The database being modified.
     *
     * Generated from protobuf field <code>string database = 1;</code>
     * @return string
     */
    public function getDatabase()
    {
        return $this->database;
    }

    /**
     * The database being modified.
     *
     * Generated from protobuf field <code>string database = 1;</code>
     * @param string $var
     */
    public function setDatabase($var)
    {
        GPBUtil::checkString($var, True);
        $this->database = $var;
    }

    /**
     * For an update this list contains all the statements. For an
     * individual statement, this list contains only that statement.
     *
     * Generated from protobuf field <code>repeated string statements = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getStatements()
    {
        return $this->statements;
    }

    /**
     * For an update this list contains all the statements. For an
     * individual statement, this list contains only that statement.
     *
     * Generated from protobuf field <code>repeated string statements = 2;</code>
     * @param array|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setStatements(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->statements = $arr;
    }

    /**
     * Reports the commit timestamps of all statements that have
     * succeeded so far, where `commit_timestamps[i]` is the commit
     * timestamp for the statement `statements[i]`.
     *
     * Generated from protobuf field <code>repeated .google.protobuf.Timestamp commit_timestamps = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getCommitTimestamps()
    {
        return $this->commit_timestamps;
    }

    /**
     * Reports the commit timestamps of all statements that have
     * succeeded so far, where `commit_timestamps[i]` is the commit
     * timestamp for the statement `statements[i]`.
     *
     * Generated from protobuf field <code>repeated .google.protobuf.Timestamp commit_timestamps = 3;</code>
     * @param array|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setCommitTimestamps(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Protobuf\Timestamp::class);
        $this->commit_timestamps = $arr;
    }

}
