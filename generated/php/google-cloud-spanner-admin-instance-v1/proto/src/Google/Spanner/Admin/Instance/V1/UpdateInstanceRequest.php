<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

namespace Google\Spanner\Admin\Instance\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The request for [UpdateInstance][google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance].
 *
 * Protobuf type <code>Google\Spanner\Admin\Instance\V1\UpdateInstanceRequest</code>
 */
class UpdateInstanceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The instance to update, which must always include the instance
     * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
     *
     * Generated from protobuf field <code>.google.spanner.admin.instance.v1.Instance instance = 1;</code>
     */
    private $instance = null;
    /**
     * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
     * The field mask must always be specified; this prevents any future fields in
     * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
     * about them.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    private $field_mask = null;

    public function __construct() {
        \GPBMetadata\Google\Spanner\Admin\Instance\V1\SpannerInstanceAdmin::initOnce();
        parent::__construct();
    }

    /**
     * Required. The instance to update, which must always include the instance
     * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
     *
     * Generated from protobuf field <code>.google.spanner.admin.instance.v1.Instance instance = 1;</code>
     * @return \Google\Spanner\Admin\Instance\V1\Instance
     */
    public function getInstance()
    {
        return $this->instance;
    }

    /**
     * Required. The instance to update, which must always include the instance
     * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
     *
     * Generated from protobuf field <code>.google.spanner.admin.instance.v1.Instance instance = 1;</code>
     * @param \Google\Spanner\Admin\Instance\V1\Instance $var
     */
    public function setInstance(&$var)
    {
        GPBUtil::checkMessage($var, \Google\Spanner\Admin\Instance\V1\Instance::class);
        $this->instance = $var;
    }

    /**
     * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
     * The field mask must always be specified; this prevents any future fields in
     * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
     * about them.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask field_mask = 2;</code>
     * @return \Google\Protobuf\FieldMask
     */
    public function getFieldMask()
    {
        return $this->field_mask;
    }

    /**
     * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
     * The field mask must always be specified; this prevents any future fields in
     * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
     * about them.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask field_mask = 2;</code>
     * @param \Google\Protobuf\FieldMask $var
     */
    public function setFieldMask(&$var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\FieldMask::class);
        $this->field_mask = $var;
    }

}
