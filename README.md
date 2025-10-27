Microservice idea: WorkoutService
- Create log of workout done for the day
- View logs of workout

Layer Design:
```
Controller → Workout Service → Repository → Database
       ↓
    DTO ↔ Entity (via MapStruct)
```