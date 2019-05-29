package com.itransition.okay.sdkdemo.di

import com.itransition.okay.sdkdemo.DemoApplication
import com.itransition.okay.sdkdemo.ui.MainActivity
import com.itransition.protectoria.demo_linking_app.data.retrofit.TenantRepository
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, NetworkModule::class])
@Singleton
interface ApplicationComponent {

    fun inject(app: DemoApplication)

    fun inject(mainActivity: MainActivity)

    fun inject(tenantRepository: TenantRepository)

}