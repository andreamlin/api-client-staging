# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/log_entry.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import monitored_resource_pb2 as google_dot_api_dot_monitored__resource__pb2
from google.logging.type import http_request_pb2 as google_dot_logging_dot_type_dot_http__request__pb2
from google.logging.type import log_severity_pb2 as google_dot_logging_dot_type_dot_log__severity__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/logging/v2/log_entry.proto',
  package='google.logging.v2',
  syntax='proto3',
  serialized_pb=_b('\n!google/logging/v2/log_entry.proto\x12\x11google.logging.v2\x1a\x1cgoogle/api/annotations.proto\x1a#google/api/monitored_resource.proto\x1a&google/logging/type/http_request.proto\x1a&google/logging/type/log_severity.proto\x1a\x19google/protobuf/any.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x9f\x04\n\x08LogEntry\x12\x10\n\x08log_name\x18\x0c \x01(\t\x12/\n\x08resource\x18\x08 \x01(\x0b\x32\x1d.google.api.MonitoredResource\x12-\n\rproto_payload\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyH\x00\x12\x16\n\x0ctext_payload\x18\x03 \x01(\tH\x00\x12/\n\x0cjson_payload\x18\x06 \x01(\x0b\x32\x17.google.protobuf.StructH\x00\x12-\n\ttimestamp\x18\t \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x32\n\x08severity\x18\n \x01(\x0e\x32 .google.logging.type.LogSeverity\x12\x11\n\tinsert_id\x18\x04 \x01(\t\x12\x36\n\x0chttp_request\x18\x07 \x01(\x0b\x32 .google.logging.type.HttpRequest\x12\x37\n\x06labels\x18\x0b \x03(\x0b\x32\'.google.logging.v2.LogEntry.LabelsEntry\x12\x37\n\toperation\x18\x0f \x01(\x0b\x32$.google.logging.v2.LogEntryOperation\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\t\n\x07payload\"N\n\x11LogEntryOperation\x12\n\n\x02id\x18\x01 \x01(\t\x12\x10\n\x08producer\x18\x02 \x01(\t\x12\r\n\x05\x66irst\x18\x03 \x01(\x08\x12\x0c\n\x04last\x18\x04 \x01(\x08\x42]\n\x15\x63om.google.logging.v2B\rLogEntryProtoP\x01Z0google.golang.org/genproto/googleapis/logging/v2\xf8\x01\x01\x62\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_monitored__resource__pb2.DESCRIPTOR,google_dot_logging_dot_type_dot_http__request__pb2.DESCRIPTOR,google_dot_logging_dot_type_dot_log__severity__pb2.DESCRIPTOR,google_dot_protobuf_dot_any__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)




_LOGENTRY_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.logging.v2.LogEntry.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.logging.v2.LogEntry.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.logging.v2.LogEntry.LabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=_descriptor._ParseOptions(descriptor_pb2.MessageOptions(), _b('8\001')),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=781,
  serialized_end=826,
)

_LOGENTRY = _descriptor.Descriptor(
  name='LogEntry',
  full_name='google.logging.v2.LogEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='log_name', full_name='google.logging.v2.LogEntry.log_name', index=0,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.logging.v2.LogEntry.resource', index=1,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='proto_payload', full_name='google.logging.v2.LogEntry.proto_payload', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='text_payload', full_name='google.logging.v2.LogEntry.text_payload', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='json_payload', full_name='google.logging.v2.LogEntry.json_payload', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='google.logging.v2.LogEntry.timestamp', index=5,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='severity', full_name='google.logging.v2.LogEntry.severity', index=6,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='insert_id', full_name='google.logging.v2.LogEntry.insert_id', index=7,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='http_request', full_name='google.logging.v2.LogEntry.http_request', index=8,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.logging.v2.LogEntry.labels', index=9,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='operation', full_name='google.logging.v2.LogEntry.operation', index=10,
      number=15, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[_LOGENTRY_LABELSENTRY, ],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='payload', full_name='google.logging.v2.LogEntry.payload',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=294,
  serialized_end=837,
)


_LOGENTRYOPERATION = _descriptor.Descriptor(
  name='LogEntryOperation',
  full_name='google.logging.v2.LogEntryOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.logging.v2.LogEntryOperation.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='producer', full_name='google.logging.v2.LogEntryOperation.producer', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='first', full_name='google.logging.v2.LogEntryOperation.first', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='last', full_name='google.logging.v2.LogEntryOperation.last', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=839,
  serialized_end=917,
)

_LOGENTRY_LABELSENTRY.containing_type = _LOGENTRY
_LOGENTRY.fields_by_name['resource'].message_type = google_dot_api_dot_monitored__resource__pb2._MONITOREDRESOURCE
_LOGENTRY.fields_by_name['proto_payload'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_LOGENTRY.fields_by_name['json_payload'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_LOGENTRY.fields_by_name['timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_LOGENTRY.fields_by_name['severity'].enum_type = google_dot_logging_dot_type_dot_log__severity__pb2._LOGSEVERITY
_LOGENTRY.fields_by_name['http_request'].message_type = google_dot_logging_dot_type_dot_http__request__pb2._HTTPREQUEST
_LOGENTRY.fields_by_name['labels'].message_type = _LOGENTRY_LABELSENTRY
_LOGENTRY.fields_by_name['operation'].message_type = _LOGENTRYOPERATION
_LOGENTRY.oneofs_by_name['payload'].fields.append(
  _LOGENTRY.fields_by_name['proto_payload'])
_LOGENTRY.fields_by_name['proto_payload'].containing_oneof = _LOGENTRY.oneofs_by_name['payload']
_LOGENTRY.oneofs_by_name['payload'].fields.append(
  _LOGENTRY.fields_by_name['text_payload'])
_LOGENTRY.fields_by_name['text_payload'].containing_oneof = _LOGENTRY.oneofs_by_name['payload']
_LOGENTRY.oneofs_by_name['payload'].fields.append(
  _LOGENTRY.fields_by_name['json_payload'])
_LOGENTRY.fields_by_name['json_payload'].containing_oneof = _LOGENTRY.oneofs_by_name['payload']
DESCRIPTOR.message_types_by_name['LogEntry'] = _LOGENTRY
DESCRIPTOR.message_types_by_name['LogEntryOperation'] = _LOGENTRYOPERATION

LogEntry = _reflection.GeneratedProtocolMessageType('LogEntry', (_message.Message,), dict(

  LabelsEntry = _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), dict(
    DESCRIPTOR = _LOGENTRY_LABELSENTRY,
    __module__ = 'google.logging.v2.log_entry_pb2'
    # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntry.LabelsEntry)
    ))
  ,
  DESCRIPTOR = _LOGENTRY,
  __module__ = 'google.logging.v2.log_entry_pb2'
  # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntry)
  ))
_sym_db.RegisterMessage(LogEntry)
_sym_db.RegisterMessage(LogEntry.LabelsEntry)

LogEntryOperation = _reflection.GeneratedProtocolMessageType('LogEntryOperation', (_message.Message,), dict(
  DESCRIPTOR = _LOGENTRYOPERATION,
  __module__ = 'google.logging.v2.log_entry_pb2'
  # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntryOperation)
  ))
_sym_db.RegisterMessage(LogEntryOperation)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\025com.google.logging.v2B\rLogEntryProtoP\001Z0google.golang.org/genproto/googleapis/logging/v2\370\001\001'))
_LOGENTRY_LABELSENTRY.has_options = True
_LOGENTRY_LABELSENTRY._options = _descriptor._ParseOptions(descriptor_pb2.MessageOptions(), _b('8\001'))
import abc
import six
from grpc.beta import implementations as beta_implementations
from grpc.beta import interfaces as beta_interfaces
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities
# @@protoc_insertion_point(module_scope)
