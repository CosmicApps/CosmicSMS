$:.unshift(File.expand_path('../../lib', __FILE__))
$:.unshift(File.expand_path('../../../aws-sdk-core/features', __FILE__))
$:.unshift(File.expand_path('../../../aws-sdk-core/lib', __FILE__))
$:.unshift(File.expand_path('../../../aws-sigv4/lib', __FILE__))

require 'features_helper'
require 'smsapi-sdk'

SmsApi::Client.add_plugin(ApiCallTracker)
