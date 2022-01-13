/**
Copyright 2021 João Costa Seco

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package pt.unl.fct.di.iadidemo.bookshelf.domain

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface UserRepository : PagingAndSortingRepository<UserDAO, String>

interface BookRepository : PagingAndSortingRepository<BookDAO, Long> {
    @Query("select count(b) from BookDAO b")
    fun getCount(): Long

}

interface RoleRepository : CrudRepository<RoleDAO, String>

interface AuthorRepository : CrudRepository<AuthorDAO, Long>

interface SessionRepository : CrudRepository<SessionDAO, Long>
