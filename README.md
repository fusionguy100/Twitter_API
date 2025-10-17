#  Twitter Clone API

A RESTful **social media API** built with **Spring Boot** that simulates core Twitter functionality — users can post tweets, reply, follow others, and explore hashtags.  

This project was developed collaboratively as part of the **Cook Systems FastTrack’D** Java Developer program.  
It emphasizes clean architecture, DTO mapping, robust entity relationships, and thorough testing using **Postman collections**.

---

## 🚀 Features

-  **User Management**  
  - Create, view, update, and soft-delete users.  
  - Follow and unfollow other users.  

-  **Tweets & Replies**  
  - Post new tweets and replies.  
  - Retrieve tweets by user, mentions, or hashtags.  
  - Soft delete tweets without removing from database.  

-  **Hashtags**  
  - Automatically parsed from tweet content.  
  - Linked to all associated tweets.  

-  **DTOs & Mapping**  
  - Implemented via **MapStruct** for clean data transformation between entities and response models.  

-  **Comprehensive API Testing**  
  - Full Postman test suite covering user creation, tweeting, replies, follows, and hashtag endpoints.  

---

##  Tech Stack

| Layer | Technology |
|-------|-------------|
| **Backend** | Spring Boot (Java 17) |
| **Database** | PostgreSQL |
| **ORM** | Spring Data JPA / Hibernate |
| **DTO Mapping** | MapStruct |
| **Testing** | JUnit, Postman API Collections |
| **Build Tool** | Maven |
| **Containerization** | Docker (optional) |

---

The application follows a **layered architecture** with clear separation of concerns between:
- Controller → Service → Repository  
- DTOs for external representation  
- Entities for persistence layer  

---

##  Postman API Testing

A full Postman collection (`TwitterCloneAPI.postman_collection.json`) was created to automate and validate all endpoints.

###  Test Coverage Includes:
| Area | Tests |
|------|-------|
| **Users** | Create user, get all users, update profile, deactivate (soft delete) |
| **Tweets** | Create tweet, reply to tweet, delete tweet, get feed |
| **Followers** | Follow/unfollow users, retrieve following list |
| **Hashtags** | Create and retrieve hashtags, list tweets by hashtag |

Each test automatically validates:
- Correct HTTP status codes  
- Proper JSON response structure  
- Entity relationships (e.g., user-tweet linkage)  

**How to Run Tests:**
1. Import the Postman collection into your Postman workspace.  
2. Ensure your API is running locally (`http://localhost:8080`).  
3. Run the entire test suite or selected folders.  
4. View test results under the **Collection Runner** tab.

---


