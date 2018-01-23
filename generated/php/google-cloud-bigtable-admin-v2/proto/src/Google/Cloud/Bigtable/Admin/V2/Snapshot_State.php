<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/table.proto

namespace Google\Cloud\Bigtable\Admin\V2;

/**
 * Possible states of a snapshot.
 *
 * Protobuf enum <code>Google\Bigtable\Admin\V2\Snapshot\State</code>
 */
class Snapshot_State
{
    /**
     * The state of the snapshot could not be determined.
     *
     * Generated from protobuf enum <code>STATE_NOT_KNOWN = 0;</code>
     */
    const STATE_NOT_KNOWN = 0;
    /**
     * The snapshot has been successfully created and can serve all requests.
     *
     * Generated from protobuf enum <code>READY = 1;</code>
     */
    const READY = 1;
    /**
     * The snapshot is currently being created, and may be destroyed if the
     * creation process encounters an error. A snapshot may not be restored to a
     * table while it is being created.
     *
     * Generated from protobuf enum <code>CREATING = 2;</code>
     */
    const CREATING = 2;
}
