Pod::Spec.new do |s|
  s.name             = 'test_demo1'
  s.version          = '0.0.2'
  s.summary          = 'A short description of test_demo1.'
  s.description      = <<-DESC
TODO: Add long description of the pod here.
                       DESC

  s.homepage         = 'https://devopsTestCloud_mars_tob'
  s.license          = { :type => 'MIT', :file => 'LICENSE' }
  s.author           = { 'mars' => 'mars@bytedance.com' }
  s.ios.deployment_target = '8.0'
  s.source 	= { :git => 'git@github.com:bytedance-mars/iOSComponentDemo.git'}
  s.source_files = 'DevopsTestModule1/DevopsTestModule1/**/*.{h,m}' 
  s.default_subspecs = 'Core'
  s.subspec 'Core' do |ss|
    ss.source_files = 'DevopsTestModule1/DevopsTestModule1/*.{h,m}' 
  end 
  s.subspec 'AAS' do |ss| 
    ss.source_files = 'DevopsTestModule1/DevopsTestModule1/AA/*.{h,m}' 
    ss.dependency 'test_demo1/Core'
  end
  s.subspec 'BBS' do |ss|
    ss.source_files = 'DevopsTestModule1/DevopsTestModule1/BB/*.{h,m}' 
    ss.dependency 'test_demo1/Core'
  end
  s.subspec 'ModuleInterface' do |ss|
    ss.subspec 'MIA' do |sss|
        sss.source_files = 'devopsTestCloud1/DevopsTestModule1/AA/*.{h,m}' 
    end
    ss.subspec 'MIB' do |sss|
        sss.source_files = 'devopsTestCloud1/DevopsTestModule1/BB/*.{h,m}' 
    end
  end

end
