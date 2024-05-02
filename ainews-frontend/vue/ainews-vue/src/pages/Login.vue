<template>
  <div class="login-wrap">
    <div class="login-html">
      <input id="tab-1" type="radio" name="tab" class="sign-in" checked /><label
        for="tab-1"
        class="tab"
        >Sign In</label
      >
      <input id="tab-2" type="radio" name="tab" class="sign-up" /><label
        for="tab-2"
        class="tab"
        >Sign Up</label
      >
      <div class="login-form">
        <div class="sign-in-htm">
          <div class="group">
            <label for="user" class="label">Your ID</label>
            <input id="user" type="text" class="input" />
          </div>
          <div class="group">
            <label for="pass" class="label">Password</label>
            <input
              id="pass"
              type="password"
              class="input"
              data-type="password"
            />
          </div>
          <div class="group">
            <input id="check" type="checkbox" class="check" checked />
          </div>
          <div class="group">
            <input type="submit" class="button" value="Sign In" />
          </div>
          <div class="hr"></div>
          <div class="foot-lnk">
            <a href="#forgot">Forgot Password?</a>
          </div>
        </div>

        <!-- 회원가입 -->
        <div class="sign-up-htm">
          <div class="group">
            <label for="user" class="label">Your ID</label>
            <input id="user" type="text" class="input" />
          </div>

          <div class="group">
            <label for="pass" class="label">Password</label>
            <input
              id="pass"
              type="password"
              class="input"
              data-type="password"
            />
          </div>
          <div class="group">
            <label for="pass" class="label">User Full Name</label>
            <input
              id="pass"
              type="password"
              class="input"
              data-type="password"
            />
          </div>
          <div class="group">
            <label for="pass" class="label">NickName</label>
            <input id="pass" type="text" class="input" />
          </div>
          <div class="group">
            <input type="submit" class="button" value="Sign Up" />
          </div>
          <div class="hr"></div>
          <div class="foot-lnk">
            <label for="tab-1">Already Member?</label>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script></script>

<style>
@import "/src/assets/css/reset.css";
@import "/src/assets/css/login.css";
</style>
