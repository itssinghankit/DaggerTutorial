package com.example.daggertutorial

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

//@Module
//class UserRepositoryModule {
//
//    @Provides
//    fun getUserRepository():UserRepository{
//        return SQLUserRepository()
//    }
//}
@Module
class UserRepositoryModule(val returnCount:Int) {
//    @Named("sql")
    @SqlAnnotation
    @Provides
    fun getSqlRepository(sqlUserRepository: SQLUserRepository):UserRepository{
        return sqlUserRepository
    }

    @Named("firebase")
    @Provides
    fun getFirebaseUserRepository():UserRepository{
        return FirebaseUserRepository(returnCount)
    }
}