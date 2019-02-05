module SmsApi
  module Types

    class Empty < Aws::EmptyStructure; end

    # @!attribute [rw] message
    #   @return [String]
    #
    class Error < Struct.new(
      :message)
      include Aws::Structure
    end

    # @api private
    #
    class GetRestAccountBalanceRequest < Aws::EmptyStructure; end

    class GetRestAccountBalanceResponse < Aws::EmptyStructure; end

    # @api private
    #
    class PostClickAccountBalanceRequest < Aws::EmptyStructure; end

    class PostClickAccountBalanceResponse < Aws::EmptyStructure; end

    # @api private
    #
    class PostClickSmsSendRequest < Aws::EmptyStructure; end

    class PostClickSmsSendResponse < Aws::EmptyStructure; end

    # @api private
    #
    class PostRestSmsSendRequest < Aws::EmptyStructure; end

    class PostRestSmsSendResponse < Aws::EmptyStructure; end

  end
end
