# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/type/dayofweek.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_enum "google.type.DayOfWeek" do
    value :DAY_OF_WEEK_UNSPECIFIED, 0
    value :MONDAY, 1
    value :TUESDAY, 2
    value :WEDNESDAY, 3
    value :THURSDAY, 4
    value :FRIDAY, 5
    value :SATURDAY, 6
    value :SUNDAY, 7
  end
end

module Google
  module Type
    DayOfWeek = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.type.DayOfWeek").enummodule
  end
end
