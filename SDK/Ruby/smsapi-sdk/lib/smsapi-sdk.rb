require 'aws-sdk-core'
require 'aws-sigv4'

require_relative 'smsapi-sdk/types'
require_relative 'smsapi-sdk/client_api'
require_relative 'smsapi-sdk/client'
require_relative 'smsapi-sdk/errors'
require_relative 'smsapi-sdk/resource'
require_relative 'smsapi-sdk/customizations'

# This module provides support for API-PROD-cosmicsms. This module is available in the
# `smsapi-sdk` gem.
#
# # Client
#
# The {Client} class provides one method for each API operation. Operation
# methods each accept a hash of request parameters and return a response
# structure.
#
# See {Client} for more information.
#
# # Errors
#
# Errors returned from API-PROD-cosmicsms all
# extend {Errors::ServiceError}.
#
#     begin
#       # do stuff
#     rescue SmsApi::Errors::ServiceError
#       # rescues all service API errors
#     end
#
# See {Errors} for more information.
#
# @service
module SmsApi

  GEM_VERSION = '1.0.0'

end
