package com.example.daggertutorial

import dagger.Binds
import dagger.Module
import dagger.Provides

//@Module
//class UserRepositoryModule {
//
//    @Provides
//    fun getUserRepository():UserRepository{
//        return SQLUserRepository()
//    }
//}
@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getUserRepository(sqlUserRepository: SQLUserRepository):UserRepository
}