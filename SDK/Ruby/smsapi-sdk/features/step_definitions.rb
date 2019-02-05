Before("@smsapi") do
  @service = SmsApi::Resource.new
  @client = @service.client
end

After("@smsapi") do
  # shared cleanup logic
end
