/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.admin.v2.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.bigtable.admin.v2.Cluster;
import com.google.bigtable.admin.v2.CreateClusterMetadata;
import com.google.bigtable.admin.v2.CreateClusterRequest;
import com.google.bigtable.admin.v2.CreateInstanceMetadata;
import com.google.bigtable.admin.v2.CreateInstanceRequest;
import com.google.bigtable.admin.v2.DeleteClusterRequest;
import com.google.bigtable.admin.v2.DeleteInstanceRequest;
import com.google.bigtable.admin.v2.GetClusterRequest;
import com.google.bigtable.admin.v2.GetInstanceRequest;
import com.google.bigtable.admin.v2.Instance;
import com.google.bigtable.admin.v2.ListClustersRequest;
import com.google.bigtable.admin.v2.ListClustersResponse;
import com.google.bigtable.admin.v2.ListInstancesRequest;
import com.google.bigtable.admin.v2.ListInstancesResponse;
import com.google.bigtable.admin.v2.UpdateClusterMetadata;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Cloud Bigtable Admin API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class BigtableInstanceAdminStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public OperationCallable<CreateInstanceRequest, Instance, CreateInstanceMetadata, Operation>
      createInstanceOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstanceOperationCallable()");
  }

  public UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstanceCallable()");
  }

  public UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceCallable()");
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstancesCallable()");
  }

  public UnaryCallable<Instance, Instance> updateInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInstanceCallable()");
  }

  public UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstanceCallable()");
  }

  public OperationCallable<CreateClusterRequest, Cluster, CreateClusterMetadata, Operation>
      createClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createClusterOperationCallable()");
  }

  public UnaryCallable<CreateClusterRequest, Operation> createClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: createClusterCallable()");
  }

  public UnaryCallable<GetClusterRequest, Cluster> getClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: getClusterCallable()");
  }

  public UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable() {
    throw new UnsupportedOperationException("Not implemented: listClustersCallable()");
  }

  public OperationCallable<Cluster, Cluster, UpdateClusterMetadata, Operation>
      updateClusterOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateClusterOperationCallable()");
  }

  public UnaryCallable<Cluster, Operation> updateClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: updateClusterCallable()");
  }

  public UnaryCallable<DeleteClusterRequest, Empty> deleteClusterCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteClusterCallable()");
  }
}