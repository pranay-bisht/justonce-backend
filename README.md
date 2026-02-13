# JustOnce Backend

This repository contains the backend service for **JustOnce**, a minimal web application focused on creating a pause between impulse and action.

The backend is responsible for handling subscriptions, storing data securely, and managing automated, opt-in email delivery with strict ethical boundaries.

---

## ⚠️ Disclaimer

**JustOnce is not therapy and does not replace professional help.**  
If gambling is causing significant distress or harm, speaking with a qualified mental health professional can be valuable.

The backend supports occasional newsletters intended as quiet reflections — not advice, treatment, or behavioral intervention.

---

## 🏗️ Responsibilities

The backend handles:

- Email subscription via REST API
- Secure storage of subscriber data
- Duplicate email prevention
- Scheduled email automation
- (Optional) AI-assisted content generation under strict constraints
- CORS-safe communication with the frontend

No user behavior tracking or profiling is performed.

---

## 🧠 Design Principles

- Minimal data collection
- Explicit user consent
- No personalization based on behavior
- No real-time or impulse-triggered messaging
- Ethical automation over engagement metrics

---

## 🛠️ Tech Stack

- **Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Database**: PostgreSQL
- **ORM**: Spring Data JPA (Hibernate)
- **Deployment**: Render (Docker-based)
- **Scheduling**: Spring Scheduler

---
