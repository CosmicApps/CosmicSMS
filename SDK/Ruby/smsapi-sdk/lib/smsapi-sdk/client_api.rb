module SmsApi
  # @api private
  module ClientApi

    include Seahorse::Model

    BadRequestException = Shapes::StructureShape.new(name: 'BadRequestException')
    Empty = Shapes::StructureShape.new(name: 'Empty')
    Error = Shapes::StructureShape.new(name: 'Error')
    GetRestAccountBalanceRequest = Shapes::StructureShape.new(name: 'GetRestAccountBalanceRequest')
    GetRestAccountBalanceResponse = Shapes::StructureShape.new(name: 'GetRestAccountBalanceResponse')
    InternalServerErrorException = Shapes::StructureShape.new(name: 'InternalServerErrorException')
    MethodNotAllowedException = Shapes::StructureShape.new(name: 'MethodNotAllowedException')
    NotFoundException = Shapes::StructureShape.new(name: 'NotFoundException')
    PaymentRequiredException = Shapes::StructureShape.new(name: 'PaymentRequiredException')
    PostClickAccountBalanceRequest = Shapes::StructureShape.new(name: 'PostClickAccountBalanceRequest')
    PostClickAccountBalanceResponse = Shapes::StructureShape.new(name: 'PostClickAccountBalanceResponse')
    PostClickSmsSendRequest = Shapes::StructureShape.new(name: 'PostClickSmsSendRequest')
    PostClickSmsSendResponse = Shapes::StructureShape.new(name: 'PostClickSmsSendResponse')
    PostRestSmsSendRequest = Shapes::StructureShape.new(name: 'PostRestSmsSendRequest')
    PostRestSmsSendResponse = Shapes::StructureShape.new(name: 'PostRestSmsSendResponse')
    ServiceUnavailableException = Shapes::StructureShape.new(name: 'ServiceUnavailableException')
    UnauthorizedException = Shapes::StructureShape.new(name: 'UnauthorizedException')
    boolean = Shapes::BooleanShape.new(name: 'boolean')
    double = Shapes::FloatShape.new(name: 'double')
    integer = Shapes::IntegerShape.new(name: 'integer')
    long = Shapes::IntegerShape.new(name: 'long')
    string = Shapes::StringShape.new(name: 'string')
    timestampIso8601 = Shapes::TimestampShape.new(name: 'timestampIso8601', timestampFormat: "iso8601")
    timestampUnix = Shapes::TimestampShape.new(name: 'timestampUnix', timestampFormat: "iso8601")

    Empty.struct_class = Types::Empty

    Error.add_member(:message, Shapes::ShapeRef.new(shape: string, location_name: "message"))
    Error.struct_class = Types::Error

    GetRestAccountBalanceRequest.struct_class = Types::GetRestAccountBalanceRequest

    GetRestAccountBalanceResponse.struct_class = Types::GetRestAccountBalanceResponse

    PostClickAccountBalanceRequest.struct_class = Types::PostClickAccountBalanceRequest

    PostClickAccountBalanceResponse.struct_class = Types::PostClickAccountBalanceResponse

    PostClickSmsSendRequest.struct_class = Types::PostClickSmsSendRequest

    PostClickSmsSendResponse.struct_class = Types::PostClickSmsSendResponse

    PostRestSmsSendRequest.struct_class = Types::PostRestSmsSendRequest

    PostRestSmsSendResponse.struct_class = Types::PostRestSmsSendResponse


    # @api private
    API = Seahorse::Model::Api.new.tap do |api|

      api.version = "2018-08-12T22:20:27Z"

      api.metadata = {
        "endpointPrefix" => "api",
        "protocol" => "api-gateway",
        "serviceFullName" => "API-PROD-cosmicsms",
      }

      api.add_operation(:get_rest_account_balance, Seahorse::Model::Operation.new.tap do |o|
        o.name = "GetRestAccountBalance"
        o.http_method = "GET"
        o.http_request_uri = "/prod/rest/account/balance"
        o['authtype'] = "none"
        o.input = Shapes::ShapeRef.new(shape: GetRestAccountBalanceRequest)
        o.output = Shapes::ShapeRef.new(shape: GetRestAccountBalanceResponse)
        o.errors << Shapes::ShapeRef.new(shape: BadRequestException)
        o.errors << Shapes::ShapeRef.new(shape: UnauthorizedException)
        o.errors << Shapes::ShapeRef.new(shape: InternalServerErrorException)
        o.errors << Shapes::ShapeRef.new(shape: PaymentRequiredException)
        o.errors << Shapes::ShapeRef.new(shape: NotFoundException)
        o.errors << Shapes::ShapeRef.new(shape: ServiceUnavailableException)
        o.errors << Shapes::ShapeRef.new(shape: MethodNotAllowedException)
      end)

      api.add_operation(:post_click_account_balance, Seahorse::Model::Operation.new.tap do |o|
        o.name = "PostClickAccountBalance"
        o.http_method = "POST"
        o.http_request_uri = "/prod/click/account/balance"
        o['authtype'] = "none"
        o.input = Shapes::ShapeRef.new(shape: PostClickAccountBalanceRequest)
        o.output = Shapes::ShapeRef.new(shape: PostClickAccountBalanceResponse)
      end)

      api.add_operation(:post_click_sms_send, Seahorse::Model::Operation.new.tap do |o|
        o.name = "PostClickSmsSend"
        o.http_method = "POST"
        o.http_request_uri = "/prod/click/sms/send"
        o['authtype'] = "none"
        o.input = Shapes::ShapeRef.new(shape: PostClickSmsSendRequest)
        o.output = Shapes::ShapeRef.new(shape: PostClickSmsSendResponse)
      end)

      api.add_operation(:post_rest_sms_send, Seahorse::Model::Operation.new.tap do |o|
        o.name = "PostRestSmsSend"
        o.http_method = "POST"
        o.http_request_uri = "/prod/rest/sms/send"
        o['authtype'] = "none"
        o.input = Shapes::ShapeRef.new(shape: PostRestSmsSendRequest)
        o.output = Shapes::ShapeRef.new(shape: PostRestSmsSendResponse)
        o.errors << Shapes::ShapeRef.new(shape: BadRequestException)
        o.errors << Shapes::ShapeRef.new(shape: UnauthorizedException)
        o.errors << Shapes::ShapeRef.new(shape: InternalServerErrorException)
        o.errors << Shapes::ShapeRef.new(shape: PaymentRequiredException)
        o.errors << Shapes::ShapeRef.new(shape: NotFoundException)
        o.errors << Shapes::ShapeRef.new(shape: ServiceUnavailableException)
        o.errors << Shapes::ShapeRef.new(shape: MethodNotAllowedException)
      end)
    end

  end
end
