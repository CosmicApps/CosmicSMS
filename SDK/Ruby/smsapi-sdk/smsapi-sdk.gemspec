Gem::Specification.new do |spec|

  spec.name          = 'smsapi-sdk'
  spec.version       = File.read(File.expand_path('../VERSION', __FILE__)).strip
  spec.summary       = 'API-PROD-cosmicsms'
  spec.description   = 'Gem Description'
  spec.author        = 'Author Name'
  spec.homepage      = 'http://gem-homepage.com'
  spec.license       = 'Apache-2.0'
  spec.email         = ['yourname@email.com']
  spec.require_paths = ['lib']
  spec.files         = Dir['lib/**/*.rb']

  spec.add_dependency('aws-sdk-core', '>= 3.12', '< 4.0')
  spec.add_dependency('aws-sigv4', '~> 1.0')

end
