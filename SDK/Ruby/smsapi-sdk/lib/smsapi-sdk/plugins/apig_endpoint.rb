module SmsApi
  module Plugins

    class APIGEndpoint < Seahorse::Client::Plugin

      def after_initialize(client)
        if client.config.endpoint.nil?
          client.config.endpoint = 'https://api.cosmicsms.com'
        end
      end

    end
  end
end
