<?php
/*
 * Copyright 2017, Google LLC All rights reserved.
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

/*
 * GENERATED CODE WARNING
 * This file was automatically generated - do not edit!
 */

namespace Google\Cloud\Tests\Unit\Dataproc\V1;

use Google\Cloud\Dataproc\V1\JobControllerClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Dataproc\V1\Job;
use Google\Cloud\Dataproc\V1\ListJobsResponse;
use Google\Protobuf\Any;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group dataproc
 * @group grpc
 */
class JobControllerClientTest extends GeneratedTest
{
    public function createMockClusterControllerImpl($hostname, $opts)
    {
        return new MockClusterControllerImpl($hostname, $opts);
    }

    public function createMockJobControllerImpl($hostname, $opts)
    {
        return new MockJobControllerImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => JobControllerClient::SERVICE_ADDRESS,
            'port' => JobControllerClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return JobControllerClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new JobControllerClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function submitJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $driverOutputResourceUri = 'driverOutputResourceUri-542229086';
        $driverControlFilesUri = 'driverControlFilesUri207057643';
        $expectedResponse = new Job();
        $expectedResponse->setDriverOutputResourceUri($driverOutputResourceUri);
        $expectedResponse->setDriverControlFilesUri($driverControlFilesUri);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $job = new Job();

        $response = $client->submitJob($projectId, $region, $job);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.dataproc.v1.JobController/SubmitJob', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($region, $actualRequestObject->getRegion());
        $this->assertProtobufEquals($job, $actualRequestObject->getJob());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function submitJobExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $job = new Job();

        try {
            $client->submitJob($projectId, $region, $job);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $driverOutputResourceUri = 'driverOutputResourceUri-542229086';
        $driverControlFilesUri = 'driverControlFilesUri207057643';
        $expectedResponse = new Job();
        $expectedResponse->setDriverOutputResourceUri($driverOutputResourceUri);
        $expectedResponse->setDriverControlFilesUri($driverControlFilesUri);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';

        $response = $client->getJob($projectId, $region, $jobId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.dataproc.v1.JobController/GetJob', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($region, $actualRequestObject->getRegion());
        $this->assertProtobufEquals($jobId, $actualRequestObject->getJobId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getJobExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';

        try {
            $client->getJob($projectId, $region, $jobId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listJobsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $jobsElement = new Job();
        $jobs = [$jobsElement];
        $expectedResponse = new ListJobsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setJobs($jobs);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';

        $response = $client->listJobs($projectId, $region);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getJobs()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.dataproc.v1.JobController/ListJobs', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($region, $actualRequestObject->getRegion());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listJobsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';

        try {
            $client->listJobs($projectId, $region);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $driverOutputResourceUri = 'driverOutputResourceUri-542229086';
        $driverControlFilesUri = 'driverControlFilesUri207057643';
        $expectedResponse = new Job();
        $expectedResponse->setDriverOutputResourceUri($driverOutputResourceUri);
        $expectedResponse->setDriverControlFilesUri($driverControlFilesUri);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';
        $job = new Job();
        $updateMask = new FieldMask();

        $response = $client->updateJob($projectId, $region, $jobId, $job, $updateMask);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.dataproc.v1.JobController/UpdateJob', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($region, $actualRequestObject->getRegion());
        $this->assertProtobufEquals($jobId, $actualRequestObject->getJobId());
        $this->assertProtobufEquals($job, $actualRequestObject->getJob());
        $this->assertProtobufEquals($updateMask, $actualRequestObject->getUpdateMask());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateJobExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';
        $job = new Job();
        $updateMask = new FieldMask();

        try {
            $client->updateJob($projectId, $region, $jobId, $job, $updateMask);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function cancelJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $driverOutputResourceUri = 'driverOutputResourceUri-542229086';
        $driverControlFilesUri = 'driverControlFilesUri207057643';
        $expectedResponse = new Job();
        $expectedResponse->setDriverOutputResourceUri($driverOutputResourceUri);
        $expectedResponse->setDriverControlFilesUri($driverControlFilesUri);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';

        $response = $client->cancelJob($projectId, $region, $jobId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.dataproc.v1.JobController/CancelJob', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($region, $actualRequestObject->getRegion());
        $this->assertProtobufEquals($jobId, $actualRequestObject->getJobId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function cancelJobExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';

        try {
            $client->cancelJob($projectId, $region, $jobId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';

        $client->deleteJob($projectId, $region, $jobId);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.dataproc.v1.JobController/DeleteJob', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($region, $actualRequestObject->getRegion());
        $this->assertProtobufEquals($jobId, $actualRequestObject->getJobId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteJobExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockJobControllerImpl']);
        $client = $this->createClient('createJobControllerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $region = 'region-934795532';
        $jobId = 'jobId-1154752291';

        try {
            $client->deleteJob($projectId, $region, $jobId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}