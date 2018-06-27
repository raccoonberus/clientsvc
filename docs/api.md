# API blueprint

### Registration (simple)

Path: /api/registration/simple

Method: POST

Body:

    {
        "lastName": "Smith",
        "firstName": "John",
        "middleName": "Walker",
        "birthDate": "1990-12-23",
        "email": "smith009@mail.com",
        "mobilePhone": "+123 (345) 456-67-89"
    }

Response:

    {
        "success": true
    }

### Registration (standard)

Request:

    {
        "lastName": "Smith",
        "firstName": "John",
        "middleName": "Walker",
        "birthDate": "1990-12-23",
        "email": "smith009@mail.com",
        "mobilePhone": "+123 (345) 456-67-89",
        "addressReg": "Florida, Saint-Petesburg, KoninStrase, 221",
        "addressRes": "Russian Federation, Moscow, Shkolnaya st, 123",
        "passport":  "0987 654321",
    }