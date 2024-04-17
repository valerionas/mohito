# WORK IN PROGRESS
# Page [Mohito](https://www.mohito.com/) automated tests

## Senarios:
1. Signing Up
2. Login
3. Account removal

## Sign Up

1. Open login page
2. Click on "Sukurti paskyra"
3. Input Email
4. Input Name
5. Input Surname
6. Input Password
7. Click on "Sukurti paskyra"  
   **Expected result:** In account edit page, in email field we see our inputted Email

## Login

1. Open login page
2. Input Email
3. Input password
4. Click on "Prisijungti"  
**Expected result:** In account edit page, in email field we see our inputted Email

## Account Removal
1. Do steps 1-4 from Login scenario
2. Navigate to account edit page (Click on profile icon top right)
3. Click on delete account link
4. Click on delete account button  
   **Expected result:** In span tag we see our inputted Email

