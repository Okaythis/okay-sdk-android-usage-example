package com.okay.android.sdkdemo.di

import com.okay.android.sdkdemo.DemoApplication
import com.okay.android.sdkdemo.ui.main.MainActivity
import com.okay.android.sdkdemo.repository.TenantRepository
import com.okay.android.sdkdemo.ui.main.MainFragment
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, NetworkModule::class])
@Singleton
interface ApplicationComponent {

    fun inject(app: DemoApplication)

    fun inject(mainActivity: MainActivity)

    fun inject(mainFragment: MainFragment)

    fun inject(tenantRepository: TenantRepository)

}